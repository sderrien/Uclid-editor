(set-logic ALL)
(synth-fun inv-fn ((var_i Int) (var_y Int)) Bool)
(declare-var var_y Int)
(declare-var var_y! Int)
(declare-var var_i Int)
(declare-var var_i! Int)
(define-fun init-fn ((var_i Int) (var_y Int)) Bool (= var_i 0))
(define-fun trans-fn ((var_i Int) (var_y Int) (var_i! Int) (var_y! Int)) Bool (and (= var_i! (ite (> var_y 10) (+ var_i 1) (- var_i 1))) (= var_y! var_y)))
(define-fun post-fn ((var_i Int) (var_y Int)) Bool (>= var_i 0))
(constraint (=> (init-fn var_i var_y) (inv-fn var_i var_y)))
(constraint (=> (and (inv-fn var_i var_y) (trans-fn var_i var_y var_i! var_y!)) (inv-fn var_i! var_y!)))
(constraint (=> (inv-fn var_i var_y) (post-fn var_i var_y)))
(check-synth)
