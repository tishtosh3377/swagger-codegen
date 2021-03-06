package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Citation {
  @JsonProperty("cite")
  private String cite = null;
  @JsonProperty("source")
  private String source = null;
  public String getCite() {
    return cite;
  }
  public void setCite(String cite) {
    this.cite = cite;
  }

  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Citation {\n");
    sb.append("  cite: ").append(cite).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

