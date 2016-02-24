package io.github.pierangeloc.base.impl

import io.github.pierangeloc.base.{Logger, Base}

/**
  * Created by pierangeloc on 2/20/16.
  */
object Impl extends Base with Logger {

  def countUsers = users.size
}
