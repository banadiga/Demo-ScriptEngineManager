package com.git.demo.scriptenginemanager;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class PhpMain {

    public static void main(String[] args) throws Exception {
        String code = "qwe:<?=5+5; ?>";
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByExtension("php");
        engine.eval(code);
    }
}
