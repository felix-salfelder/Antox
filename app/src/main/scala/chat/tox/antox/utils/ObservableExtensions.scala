package chat.tox.antox.utils

import rx.lang.scala.{Subscription, Observable}

object ObservableExtensions {
  final implicit class RichObservable[T](val observable: Observable[T]) extends AnyVal {
    def sub(func: T => Unit): Subscription = {
      observable.subscribe(func)
    }
  }
}
