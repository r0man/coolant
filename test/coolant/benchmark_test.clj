(ns coolant.benchmark-test
  (:require [clojure.test :refer :all]
            [coolant.core-test :refer :all]
            [criterium.core :refer [bench]]))

(deftest ^:benchmark test-benchmark-core-test
  (println "Running core-test benchmark ...")
  (bench (core-test) :verbose))

(deftest ^:benchmark test-benchmark-getter-test
  (println "Running getter-test benchmark ...")
  (bench (getter-test) :verbose))
