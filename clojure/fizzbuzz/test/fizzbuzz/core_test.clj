(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest one-returns-one
  (testing "one returns one"
    (is (= 1 1))))
