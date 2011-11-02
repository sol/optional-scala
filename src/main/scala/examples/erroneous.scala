package com.github.paulp.optional.examples
import com.github.paulp.optional

object Erroneous extends optional.Application
{
  def main(times: Option[Int], greeting: Option[String], file: java.io.File) { }
  def main(dingle: Option[Int]) {}
}
