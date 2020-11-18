(ns org.confluxnetwork.popup
  (:require [org.confluxnetwork.popup.core :as core]
            [chromex.support :refer [runonce]]))

(runonce
  (core/init!))
