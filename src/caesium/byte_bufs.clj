(ns caesium.byte-bufs
  "Byte buffer utilities, like conversions and length."
  (:require [byte-streams :as bs])
  (:import (java.nio ByteBuffer)))

(defmacro ->indirect-byte-buf-macro
  [x]
  `(bs/convert ~x ByteBuffer {:direct? false}))

(defmacro ->direct-byte-buf-macro
  [x]
  `(bs/convert ~x ByteBuffer {:direct? true}))

(defn ->indirect-byte-buf
  [x]
  (bs/convert x ByteBuffer {:direct? false}))

(defn ->direct-byte-buf
  [x]
  (bs/convert x ByteBuffer {:direct? true}))