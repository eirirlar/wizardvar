package com.kodeworks.snippet

import net.liftweb._
import wizard._


object ConfigDisplay extends Wizard {

  object wizardVar extends WizardVar((math.random * 10000000).toString)

  val screen1 = new Screen {
    override def screenTop =
      <div id="config_wizard_var">
        {wizardVar}
      </div>
  }

  val screen2 = new Screen {
    override def screenTop =
      <div id="config_wizard_var">
        {wizardVar}
      </div>
  }

  val screen3 = new Screen {
    override def screenTop =
      <div id="config_wizard_var">
        {wizardVar}
      </div>
  }

  protected def finish() {}
}