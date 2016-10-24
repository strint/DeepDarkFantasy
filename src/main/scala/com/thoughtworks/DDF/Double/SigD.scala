package com.thoughtworks.DDF.Double

trait SigD[Info[_], Repr[_]] extends LitD[Info, Repr] {
  def sigD: Repr[scala.Double => scala.Double]

  final def sigD_ : Repr[scala.Double] => Repr[scala.Double] = app(sigD)
}
