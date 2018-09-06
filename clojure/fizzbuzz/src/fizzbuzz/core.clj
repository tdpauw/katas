(ns fizzbuzz.core)

(defn divisible-by-three [input]
  (zero? (mod input 3))
)

(defn fizz-buzz [input]
  (cond
     (= input 3) "fizz"
     (= input 5) "buzz"
     (divisible-by-three input) "fizz"
     :else input)
)
