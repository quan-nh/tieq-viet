(ns tieq-viet.core
  (:require [clojure.string :as str]))

(defn encode
  "I don't do a whole lot."
  [s]
  (str/replace s #"(?i)ch|ngh|nh|ng|kh|th|ph|gh|gi|gì|tr|c|d|đ|Đ|q|r"
               {"ch"  "c", "Ch" "C", "CH" "C"
                "tr"  "c", "Tr" "C", "TR" "C"
                "c"   "k", "C" "K"
                "q"   "k", "Q" "K"
                "d"   "z", "D" "Z"
                "gi"  "z", "Gi" "Z", "GI" "Z"
                "gì"  "zì", "Gì" "ZÌ", "GÌ" "ZÌ"
                "r"   "z", "R" "Z"
                "đ"   "d", "Đ" "D"
                "gh"  "g", "Gh" "G", "GH" "G"
                "ng"  "q", "Ng" "Q", "NG" "Q"
                "ngh" "q", "Ngh" "Q", "NGH" "Q"
                "nh"  "n'", "Nh" "N'", "NH" "N'"
                "kh"  "x", "Kh" "x", "KH" "X"
                "th"  "w", "Th" "W", "TH" "W"
                "ph"  "f", "Ph" "F", "PH" "F"}))
