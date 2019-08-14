package org.Alex.transfer;

public class UpdateToDoItemRequest {

    private boolean status;

//In the future we can update other properties as well if we need to

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UpdateToDoItemRequest{" +
                "status=" + status +
                '}';
    }
}
