# tieq-viet
[![NPM](https://nodei.co/npm/tieq-viet.png?compact=true)](https://npmjs.org/package/tieq-viet)

A library to convert `Tiếng Việt` to `Tiếq Việt`, based on [this newly suggested IPA](https://thanhnien.vn/giao-duc/khi-tieng-viet-duoc-viet-thanh-tieq-viet-903068.html). 

## Usage

+ `js`
```js
const tiegViet = require('tieq-viet');

tiegViet.encode('Tiếng Việt giàu và đẹp. Đùa đấy ahihi đồ ngốc.');
// Tiếq Việt zàu và dẹp. Dùa dấy ahihi dồ qốk.
```

+ `clj(s)`
```clj
(require '[tieq-viet.core :as tieq-viet])

(tieq-viet/encode "Tiếng Việt giàu và đẹp. Đùa đấy ahihi đồ ngốc.")
;=> Tiếq Việt zàu và dẹp. Dùa dấy ahihi dồ qốk.
```

## License

MIT © 2017 Quan
