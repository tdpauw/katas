(ns fizzbuzz.core)

(defn divisible-by? [dividend divisor]
  (zero? (mod dividend divisor))
)

(defn fizz-buzz [input]
  (cond
     (and (divisible-by? input 3) (divisible-by? input 5)) "fizzbuzz"
     (divisible-by? input 3) "fizz"
     (divisible-by? input 5) "buzz"
     :else input)
)

(defn fizz-buzz-one-to-hundred []
  (map fizz-buzz (range 1 101))
)

(defn -main []
  (doseq [item (fizz-buzz-one-to-hundred)]
    (println item)
  )
)
