(ns swift-wife.core-test
 (:import [com.prowidesoftware.swift.io ConversionService IConversionService])
 (:import [com.prowidesoftware.swift.model SwiftBlock4 SwiftMessage SwiftBlock2Output SwiftTagListBlock])
 (:import [com.prowidesoftware.swift.model.mt.mt2xx MT202])
 (:import [com.prowidesoftware.swift.io.parser SwiftParser])
 (:require [clojure.test :refer :all]))

(defn parse-swift[file]
	(let[ fin (slurp file)]
  	(.message (SwiftParser. fin))))

(defn test-1 [msg]
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

(defn test-2 [msg]
	(let [b2 (.getBlock2 msg)]
	(println "-- Block 2 -- ")
	(println b2)
	(is "202" (.getMessageType b2 ))
	(is (.isOutput b2))
	(is (= (class b2) SwiftBlock2Output))
	))

(defn test-3 [msg]
	;(println "-- Block 3 -- ")
	(is (= nil (.getBlock3 msg))))

(defn test-4 [msg]
	(let [b4 (.getBlock4 msg)]
		(println "-- Block 4 -- ")
		(println b4)
		(is (= (class b4) SwiftBlock4))
		(is (.containsTag b4 "20"))
		(is (.containsTag b4 "32A"))
		(is (.containsTag b4 "53B"))
		(is (.containsTag b4 "58D"))))
	
(defn test-5 [msg]
	;(println "-- Block 5 -- ")
	(is (= nil (.getBlock5 msg))))

(defn test-msg[msg]	
	(test-1 msg)
	(test-2 msg)
	(test-3 msg)
	(test-4 msg)
	(test-5 msg))

(deftest test-mt202
	(test-msg (parse-swift "resources/mt202.txt")))