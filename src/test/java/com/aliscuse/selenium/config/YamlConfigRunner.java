package com.aliscuse.selenium.config;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class YamlConfigRunner {
    public static List main(String args) throws IOException {
        Yaml yaml = new Yaml();
        try( InputStream in = Files.newInputStream( Paths.get( args ) ) ) {
            Object data = yaml.load(in);
            return (List) java.util.Arrays.asList(data).get(0);
        }
    }
}