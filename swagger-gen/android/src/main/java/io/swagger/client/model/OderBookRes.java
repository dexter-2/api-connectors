/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Get the orderbook response
 **/
@ApiModel(description = "Get the orderbook response")
public class OderBookRes {
  
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("price")
  private String price = null;
  @SerializedName("size")
  private BigDecimal size = null;
  @SerializedName("side")
  private String side = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }
  public void setSize(BigDecimal size) {
    this.size = size;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OderBookRes oderBookRes = (OderBookRes) o;
    return (this.symbol == null ? oderBookRes.symbol == null : this.symbol.equals(oderBookRes.symbol)) &&
        (this.price == null ? oderBookRes.price == null : this.price.equals(oderBookRes.price)) &&
        (this.size == null ? oderBookRes.size == null : this.size.equals(oderBookRes.size)) &&
        (this.side == null ? oderBookRes.side == null : this.side.equals(oderBookRes.side));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OderBookRes {\n");
    
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
