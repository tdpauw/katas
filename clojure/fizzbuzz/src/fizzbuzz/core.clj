(ns fizzbuzz.core)

(defn divisible-by [dividend divisor]
  (zero? (mod dividend divisor))
)

(defn divisible-by-three [input]
  (divisible-by input 3)
)

(defn divisible-by-five [input]
  (divisible-by input 5)
)

(defn fizz-buzz [input]
  (cond
     (= input 5) "buzz"
     (divisible-by-three input) "fizz"
     (divisible-by-five input) "buzz"
     :else input)
)
