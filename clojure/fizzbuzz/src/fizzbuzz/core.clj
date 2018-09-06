(ns fizzbuzz.core)

(defn divisible-by-three [input]
  (zero? (mod input 3))
)

(defn fizz-buzz [input]
  (cond
     (= input 5) "buzz"
     (divisible-by-three input) "fizz"
     (zero? (mod input 5)) "buzz"
     :else input)
)
