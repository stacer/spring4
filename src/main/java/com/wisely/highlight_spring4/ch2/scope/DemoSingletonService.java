package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.stereotype.Service;

@Service //不写@Scope,相当于默认@Scope("singleton")
public class DemoSingletonService {

}
