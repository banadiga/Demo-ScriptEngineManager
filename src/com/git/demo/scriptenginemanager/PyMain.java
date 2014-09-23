package com.git.demo.scriptenginemanager;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class PyMain {

    public static void main(String[] args) throws Exception {
        String code = "def hello(name):\n return 'Hello ' + name";
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByExtension("python");
        engine.eval(code);
    }
}
