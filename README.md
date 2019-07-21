# tieq-viet
[![Build Status](https://travis-ci.org/quan-nh/tieq-viet.svg?branch=master)](https://travis-ci.org/quan-nh/tieq-viet)
[![Clojars Project](https://img.shields.io/clojars/v/tieq-viet.svg)](https://clojars.org/tieq-viet)
[![npm version](https://badge.fury.io/js/tieq-viet.svg)](https://www.npmjs.com/package/tieq-viet)

A library for converting `Tiếng Việt` to `Tiếq Việt`, based on [this newly suggested IPA](https://thanhnien.vn/giao-duc/khi-tieng-viet-duoc-viet-thanh-tieq-viet-903068.html). 

## Install

+ With Node
```sh
$ npm install tieq-viet
```

+ With Leiningen/Boot
```clj
[tieq-viet "1.1.3"]
```

## Usage

+ `js`
```js
var tieqViet = require('tieq-viet');

tieqViet.encode('Tiếng Việt giàu và đẹp. Đùa đấy ahihi đồ ngốc.');
// Tiếq Việt zàu và dẹp. Dùa dấy ahihi dồ qốk.
```

+ `clj(s)`
```clj
(require '[tieq-viet.core :as tieq-viet])

(tieq-viet/encode "Tiếng Việt giàu và đẹp. Đùa đấy ahihi đồ ngốc.")
;=> Tiếq Việt zàu và dẹp. Dùa dấy ahihi dồ qốk.
```

## Release
### NPM
```
$ npm login
$ npm publish
```

## License

MIT © 2017 Quan
