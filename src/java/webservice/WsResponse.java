/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

/**
 *
 * @author MAQ01LAB04
 */
public class WsResponse {
    private Object data;
    
    private boolean hasError;
    
    private String messageError;

    public WsResponse(Exception ex) {
        this.hasError = true;
        this.messageError = ex.getMessage();
    }
    
    public WsResponse(Object data) {
        this.data = data;
        this.hasError = false;
    }

    public WsResponse(String messageError) {
        this.messageError = messageError;
        this.hasError = true;
    }
    
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public String getMessageError() {
        return messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }
}
