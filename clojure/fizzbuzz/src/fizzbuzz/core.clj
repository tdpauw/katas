(ns fizzbuzz.core)

(defn fizz-buzz [input]
  (cond
     (= input 3) "fizz"
     (= input 5) "buzz"
     (zero? (mod input 3)) "fizz"
     :else input)
)
