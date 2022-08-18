package com.antlr.demoantlr;

import com.antlr.demoantlr.util.FileUtils;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoAntlrApplication {

    public static void main(String[] args) {
        // instantiate the lexer, the parser, and the walker
        String cddlContent = FileUtils.readFile("/home/hungnv/Downloads/demo-antlr/src/main/java/com/antlr/demoantlr/input/example.cddl");
        CddlLexer serverLogLexer = new CddlLexer(CharStreams.fromString(cddlContent));
        CommonTokenStream tokens = new CommonTokenStream( serverLogLexer );
        CddlParser logParser = new CddlParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        CddlListen logWalker = new CddlListen();
        walker.walk(logWalker, logParser.entry());
        logWalker.getModels().forEach(item -> {
            System.out.println(item);
        });
//        CustomModel entry = logWalker.getModels().get(0);
//        System.out.println(entry);
    }

}
