package com.inpecotpm

import groovy.json.JsonSlurper

class Components {

    static {
        def jsonSlurper = new JsonSlurper()
        def url = getClass().getResource('/Components.json')
        componentsList = jsonSlurper.parseText(url.text)
        println(componentsList)
    }

    private static List componentsList;
}

