package org.droolsfiddle.beans;

import org.kie.api.KieBase;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.websocket.Session;

/**
 * Created by gurfm on 15/06/16.
 */
@Component
@Scope(value="session", proxyMode= ScopedProxyMode.TARGET_CLASS)
public class DrlContext {

    public boolean hasKieBase() {
        return kieBase != null;
    }

    public KieBase getKieBase() {
        return kieBase;
    }

    public void setKieBase(KieBase kieContainer) {
        this.kieBase = kieContainer;
    }

    public Session getWebSocketSession() { return webSocketSession; }

    public void setWebSocketSession(Session webSocketSession) { this.webSocketSession = webSocketSession; }


    private KieBase kieBase;

    private Session webSocketSession;



}