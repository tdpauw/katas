(ns fizzbuzz.core)

(defn divisible-by-three [input]
  (zero? (mod input 3))
)

(defn divisible-by-five [input]
  (zero? (mod input 5))
)

(defn fizz-buzz [input]
  (cond
     (= input 5) "buzz"
     (divisible-by-three input) "fizz"
     (divisible-by-five input) "buzz"
     :else input)
)
