# tieq-viet

A Clojure(script) library to convert `Tiếng Việt` to `Tiếq Việt`, based on [this newly suggested IPA](https://thanhnien.vn/giao-duc/khi-tieng-viet-duoc-viet-thanh-tieq-viet-903068.html). 

## Usage

```clj
(require '[tieq-viet.core :as tieq-viet])

(tieq-viet/encode "Tiếng Việt giàu và đẹp. Đùa đấy ahihi đồ ngốc.")
;=> Tiếq Việt zàu và dẹp. Dùa dấy ahihi dồ qốk.
```

## License

MIT © 2017 Quan
