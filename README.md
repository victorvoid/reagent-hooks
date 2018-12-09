# reagent-hooks
A collection of reagent hooks.


## Installation

TODO


## How to use

- [use-state](#use-state)
- [use-effect](#use-effect)
- [use-ref](#use-ref)
- [use-reducer](#use-reducer)

### use state
```clojure
(ns test.core
  (:require [reagent-hooks.core :as rh]))

(defn entry []
  (let [[question, set-question] (rh/use-state "What?")
        [answer, set-answer] (rh/use-state "Nothing.")]
    [:div
     [:h1 question]
     [:p answer]
     [:button {:on-click #(set-question "What's your name?")} "change question"]
     [:button {:on-click #(set-answer "My name is Victor")} "change answer"]]))
```

