package com.git.demo.scriptenginemanager;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavaScriptMain {

    public static void main(String[] args) throws Exception {
        String code = "(function run() { print('run called'); })();";
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByExtension("js");
        engine.eval(code);
    }
}
