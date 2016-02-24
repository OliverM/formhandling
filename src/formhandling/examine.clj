(ns formhandling.examine
  (:require [formhandling.sample-data :refer :all]
            [examine.core :as e]
            [examine.constraints :as ec]
            [examine.macros :refer :all]))

(defvalidator
  required
  "firstname" ec/required ec/is-string
  "lastname" ec/required ec/is-string
  "timeofcontact" ec/required
  "pprem" ec/required ec/is-string
  "rsought" ec/required
  "furtheraction" ec/required ec/is-string
  "situation" ec/required ec/is-string
  "initassessstaff" ec/required ec/is-string
  "initassesstime" ec/required ec/is-string)
