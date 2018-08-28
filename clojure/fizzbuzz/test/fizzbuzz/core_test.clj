(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest one-returns-one
  (testing "one returns one"
    (is (= (fizz-buzz 1) 1))))

(deftest two-returns-two
  (testing "two returns two"
    (is (= (fizz-buzz 2) 2))
  )
)
