(ns org.confluxnetwork.background
  (:require [org.confluxnetwork.background.core :as core]
            [chromex.support :refer [runonce]]))

(runonce
  (core/init!))
