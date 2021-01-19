/*
 * generated by Xtext 2.22.0
 */
package uclid.xtext.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import java.util.List
import uclid.xtext.uclid.AssignmentRule
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.EcoreUtil2
import uclid.xtext.uclid.VarDecl
import java.util.Iterator
import uclid.xtext.uclid.TypeDecl
import uclid.xtext.uclid.Assignment
import org.eclipse.xtext.resource.EObjectDescription
import javax.inject.Scope
import org.eclipse.xtext.scoping.impl.SimpleScope

import uclid.xtext.uclid.Module
import java.sql.CallableStatement
import uclid.xtext.uclid.ProcedureDecl
import uclid.xtext.uclid.CallStatement
import java.util.Set
import uclid.xtext.uclid.VarReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.naming.QualifiedName

import uclid.xtext.uclid.InstanceDecl
import uclid.xtext.uclid.TypedObjectDecl
import uclid.xtext.uclid.VarReference
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.xtext.resource.IEObjectDescription
import uclid.xtext.uclid.FuncDecl
//import uclid.xtext.uclid.TypeReference
//import uclid.xtext.uclid.FunctionReference

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class UclidScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
 
	def getModule(EObject e) {
		EcoreUtil2.getContainerOfType(e, Module)
	}

	def getLocalVarsDecl(Module module) {
		val allLocalDecls = module.eAllContents.filter(TypedObjectDecl).toSet
		allLocalDecls.map[it->QualifiedName.create(it.name)]
	}
	
	def getInstanceLocalVarsDecl(InstanceDecl instance) {
		val allLocalDecls = instance.module.eAllContents.filter(TypedObjectDecl).toSet
		allLocalDecls.map[it->QualifiedName.create(#[instance.name,it.name])]
	}
	
	
	
	def getVarsInScope(EObject e) {
		val module = EcoreUtil2.getContainerOfType(e, Module)
		
		val allLocalDecls = module.eAllContents.filter(TypedObjectDecl).toSet
        val allInstanceDecls = module.eAllContents.filter(InstanceDecl).toSet
 
		allInstanceDecls.map[instanceLocalVarsDecl].flatten.toSet
		
    	val root = EcoreUtil2.getRootContainer(e)
		val allDecls = root.eAllContents.filter(VarDecl).toSet
		
		val res= 
			(allLocalDecls.map[it->QualifiedName.create(it.name)]
			+
			allDecls.map[it->
				{
					val qname = QualifiedName.create(#[it.module.name,it.name])
					//println(qname)
					qname
				}
			]).toSet
			+
			allInstanceDecls.map[instanceLocalVarsDecl].flatten.toSet
		
		//println(res)
		
		res
	}


	
	def getModuleInScope(EObject e) {
		val root = EcoreUtil2.getRootContainer(e)
		val allDecls = root.eAllContents.filter(Module).toSet
		
		val res= 
			allDecls.map[it->
				{
					val qname = QualifiedName.create(#[it.module.name])
					//
					qname
				}
			].toSet
		res
	}
	

    def dispatch IScope getScope(EObject context, EReference reference) {
        if (reference.name=="var") {
        	val allQNames = context.varsInScope 
        	var objdesr = allQNames.map[new EObjectDescription(it.value, it.key, null)].toSet;
        	return new SimpleScope(IScope.NULLSCOPE,objdesr as Iterable);
        }
        return  IScope.NULLSCOPE

	}
	
    def dispatch IScope getScope(VarReference context, EReference reference) {
        // We want to define the Scope for the Element's superElement cross-reference
        if (reference.name=="var") {
        	val allQNames = context.varsInScope 
        	var objdesr = allQNames.map[new EObjectDescription(it.value, it.key, null)].toSet;
        	return new SimpleScope(IScope.NULLSCOPE,objdesr as Iterable);
        }
        return  IScope.NULLSCOPE
    }
     
//   def dispatch IScope getScope(FunctionReference context, EReference reference) {
//        // We want to define the Scope for the Element's superElement cross-reference
//        if (reference.name=="target") {
//        	val allQNames = context.varsInScope 
//        	var objdesr = allQNames.map[new EObjectDescription(it.value, it.key, null)].toSet;
//        	return new SimpleScope(IScope.NULLSCOPE,objdesr as Iterable);
//        }
//        return  IScope.NULLSCOPE
//    }
//     

    def dispatch IScope getScope(InstanceDecl context, EReference reference) {
        // We want to define the Scope for the Element's superElement cross-reference
        val root = EcoreUtil2.getRootContainer(context)
        if (reference.name=="module" && root!==null) {
        	val Set<Module> allDecls = root.eAllContents.filter(Module).toSet 
        	var 
        	objdesr = allDecls.map[
        		val label =it.name
        		val qname = qualifiedNameConverter.toQualifiedName(label)
        		new EObjectDescription(qname, it, null)
        	].toSet;
        	return new SimpleScope(IScope.NULLSCOPE,objdesr as Iterable);
        }  
        return  IScope.NULLSCOPE
    }

//   
  	/**
	 * Find the first object which is an instance of a subtype of <code>c</code>
	 * in the eContainer chain. Returns null if none is found.
	 * 
	 * @param current
	 * @param eclass
	 * @return
	 */
	def static <T extends EObject> T eContainerTypeSelect(EObject _current, Class<T> c) {
		var current = _current;
		while (current !== null) {
			if (c.isInstance(current)) {
				return current as T ;
			}
			current = current.eContainer();
		}
		return null;
	}
  
//   def dispatch IScope getScope(TypeReference context, EReference reference) {
//        // We want to define the Scope for the Element's superElement cross-reference
//        val root = EcoreUtil2.getRootContainer(context)
//        if (reference.name=="decl" && root!==null) {
//        	val Set<Module> allModules = root.eAllContents.filter(Module).toSet 
//        	var res = new BasicEList<IEObjectDescription>;
//        	
//			for (module : allModules) {
//        		val Set<TypeDecl> allDecls = module.eAllContents.filter(TypeDecl).toSet 
//				for (decl : allDecls) {
//					res+=new EObjectDescription(QualifiedName.create(#[module.name,decl.name]), decl, null)
//				}
//			}
//        	
//        	
//     
//        	val module = eContainerTypeSelect(context, Module)
//        	val Set<TypeDecl> localDecls = module.eAllContents.filter(TypeDecl).toSet 
//        	res+=localDecls.map[
//        		val label =it.name
//        		new EObjectDescription(QualifiedName.create(#[label]), it, null)
//        	]
//			
//        	return new SimpleScope(IScope.NULLSCOPE,res);
//        }  
//        
//        return  IScope.NULLSCOPE
//    }
 

}
