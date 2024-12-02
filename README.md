# immutable_java

ここでは子供がお小遣いをもらうケースにおいて、mutable オブジェクトによる副作用と、immutable オブジェクトによる副作用を解消する方法をシンプルなコードを使って見てみる。

- [eaee5dd](https://github.com/junjujun/immutable_java/commit/eaee5dd9ae24bc9a36cdd6fc79efc379629731d1) までは mutable オブジェクトによる副作用が起きる。
  - Money クラスは mutable オブジェクト。
  - それによって、複数人にお小遣いをあげた場合、先にもらった子供のお小遣い金額が変わってしまう。
- [e10469e](https://github.com/junjujun/immutable_java/commit/e10469e866b3fd172c92b7a7399a33f627861a14) ではその副作用が解消されている。
  - Money クラスを　immutable オブジェクトにリファクタリング。
  - より安全を考慮し、各所に `final` を追加。 
