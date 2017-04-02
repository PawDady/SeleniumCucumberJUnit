package org.strumento.InitialConditions;

import java.util.UUID;

/**
 * Created by Pawel_D on 2017-02-10.
 */
public class PagesVariables extends PageFinals {
    private UUID post = UUID.randomUUID();
    private UUID comment = UUID.randomUUID();

    private String hardCommend = "F0A112C2-A4CC-4495-AB43-CC7031BD1F99";
    private String postwywołany;

    public String getPostwywołany() {
        return postwywołany;
    }

    public void setPostwywołany(String postwywołany) {
        this.postwywołany = postwywołany;
    }

    public void setHardCommend(String hardCommend) {
        this.hardCommend = hardCommend;
    }

    public String getHardCommend() {
        return hardCommend;
    }

    public UUID getPost() {
        return post;
    }

    public void setPost(UUID post) {
        this.post = post;
    }

    public void setComment(UUID comment) {
        this.comment = comment;
    }

    public UUID getComment() {
        return comment;
    }
}