package uclid.xtext.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import uclid.xtext.ui.internal.XtextActivator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = XtextActivator.getInstance().getPreferenceStore();
//		store.setDefault(PreferenceConstants.P_BOOLEAN, true);
//		store.setDefault(PreferenceConstants.UCLID_OUT_PATH, "choice2");
		store.setDefault(PreferenceConstants.UCLID_BIN_PATH, "/opt/uclid/bin");
		store.setDefault(PreferenceConstants.DEFAULT_MODULE_NAME,"main");
	}

}
