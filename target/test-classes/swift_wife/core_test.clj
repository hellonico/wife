(ns swift-wife.core-test
 (:import [com.prowidesoftware.swift.io ConversionService IConversionService])
 (:import [com.prowidesoftware.swift.model SwiftMessage])
 (:import [com.prowidesoftware.swift.model.mt.mt2xx MT202])
 (:import [com.prowidesoftware.swift.io.parser SwiftParser])
 (:require [clojure.test :refer :all]))

(defn parse-swift[file]
	(let[ fin (slurp file)]
  	(.message (SwiftParser. fin))))

(defn debug-1 [msg]
	(let [
		b1 (.getBlock1 msg)
		]
	(println "-- Block 1 -- ")
	(is (= "F" (.getApplicationId b1)))
	(is (=  "01" (.getServiceId b1)))
	(is (= "FOOBARCAAXXX" (.getLogicalTerminal b1)))
	(is (= "5306" (.getSessionNumber b1)))
	(is (= "843322" (.getSequenceNumber b1)))
	(println b1)))

(defn debug-2 [msg]
	(println "-- Block 2 -- ")
	(println (.getBlock2 msg)))

(defn debug-3 [msg]
	;(println "-- Block 3 -- ")
	(is (= nil (.getBlock3 msg))))

(defn debug-4 [msg]
	(println "-- Block 4 -- ")
	(println (.getBlock4 msg)))

(defn debug-5 [msg]
	;(println "-- Block 5 -- ")
	(is (= nil (.getBlock5 msg))))

(defn debug-msg[msg]	
	(debug-1 msg)
	(debug-2 msg)
	(debug-3 msg)
	(debug-4 msg)
	(debug-5 msg))

(deftest test-mt202
	(debug-msg (parse-swift "resources/mt202.txt")))