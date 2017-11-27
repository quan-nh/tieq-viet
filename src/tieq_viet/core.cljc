(ns tieq-viet.core
  (:require [clojure.string :as str]))

(defn encode
  "I don't do a whole lot."
  [s]
  (str/replace s #"(?i)ch|ngh|nh|ng|kh|th|ph|gh|gi|gì|GÌ|tr|c|d|đ|Đ|q|r"
               #(let [f (first %)
                      r (subs % 1)]
                  (case (str f (str/lower-case r))
                    ("ch" "tr") "c", ("Ch" "Tr") "C"
                    ("c" "q") "k", ("C" "Q") "K"
                    ("d" "gi" "r") "z", ("D" "Gi" "R") "Z"
                    "gì" (str "z" r), "Gì" (str "Z" r)
                    "đ" "d", "Đ" "D"
                    "gh" "g", "Gh" "G"
                    ("ng" "ngh") "q", ("Ng" "Ngh") "Q"
                    "nh" "n'", "Nh" "N'"
                    "kh" "x", "Kh" "X"
                    "th" "w", "Th" "W"
                    "ph" "f", "Ph" "F"
                    %))))
