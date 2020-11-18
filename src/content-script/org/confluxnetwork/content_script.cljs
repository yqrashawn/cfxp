(ns org.confluxnetwork.content-script
  (:require [org.confluxnetwork.content-script.core :as core]
            [chromex.support :refer [runonce]]))

(runonce
  (core/init!))
