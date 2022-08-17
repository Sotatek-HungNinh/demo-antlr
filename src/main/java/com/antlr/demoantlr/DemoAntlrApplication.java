package com.antlr.demoantlr;

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
        String logLines = "operational_cert =\n" +
                "  ( hot_vkey        : uint\n" +
                "  , sequence_number : uint\n" +
                "  , kes_period      : uint\n" +
                "  , sigma           : unit\n" +
                "  )";
        CddlLexer serverLogLexer = new CddlLexer(CharStreams.fromString(logLines));
        CommonTokenStream tokens = new CommonTokenStream( serverLogLexer );
        CddlParser logParser = new CddlParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        CddlListen logWalker = new CddlListen();
        walker.walk(logWalker, logParser.cddl());
        CustomModel entry = logWalker.getModels().get(0);
        System.out.println(entry);
    }

}
