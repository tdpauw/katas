(ns fizzbuzz.core)

(defn fizz-buzz [input]
  (cond
     (= input 3) "fizz"
     (= input 5) "buzz"
     :else input)
)
