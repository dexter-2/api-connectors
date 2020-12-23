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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class MarkPriceKlineInfo {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("period")
  private String period = null;
  @SerializedName("start_at")
  private Integer startAt = null;
  @SerializedName("open")
  private Integer open = null;
  @SerializedName("high")
  private Integer high = null;
  @SerializedName("low")
  private Integer low = null;
  @SerializedName("close")
  private Integer close = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

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
  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartAt() {
    return startAt;
  }
  public void setStartAt(Integer startAt) {
    this.startAt = startAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOpen() {
    return open;
  }
  public void setOpen(Integer open) {
    this.open = open;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getHigh() {
    return high;
  }
  public void setHigh(Integer high) {
    this.high = high;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLow() {
    return low;
  }
  public void setLow(Integer low) {
    this.low = low;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getClose() {
    return close;
  }
  public void setClose(Integer close) {
    this.close = close;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkPriceKlineInfo markPriceKlineInfo = (MarkPriceKlineInfo) o;
    return (this.id == null ? markPriceKlineInfo.id == null : this.id.equals(markPriceKlineInfo.id)) &&
        (this.symbol == null ? markPriceKlineInfo.symbol == null : this.symbol.equals(markPriceKlineInfo.symbol)) &&
        (this.period == null ? markPriceKlineInfo.period == null : this.period.equals(markPriceKlineInfo.period)) &&
        (this.startAt == null ? markPriceKlineInfo.startAt == null : this.startAt.equals(markPriceKlineInfo.startAt)) &&
        (this.open == null ? markPriceKlineInfo.open == null : this.open.equals(markPriceKlineInfo.open)) &&
        (this.high == null ? markPriceKlineInfo.high == null : this.high.equals(markPriceKlineInfo.high)) &&
        (this.low == null ? markPriceKlineInfo.low == null : this.low.equals(markPriceKlineInfo.low)) &&
        (this.close == null ? markPriceKlineInfo.close == null : this.close.equals(markPriceKlineInfo.close));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.period == null ? 0: this.period.hashCode());
    result = 31 * result + (this.startAt == null ? 0: this.startAt.hashCode());
    result = 31 * result + (this.open == null ? 0: this.open.hashCode());
    result = 31 * result + (this.high == null ? 0: this.high.hashCode());
    result = 31 * result + (this.low == null ? 0: this.low.hashCode());
    result = 31 * result + (this.close == null ? 0: this.close.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkPriceKlineInfo {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  period: ").append(period).append("\n");
    sb.append("  startAt: ").append(startAt).append("\n");
    sb.append("  open: ").append(open).append("\n");
    sb.append("  high: ").append(high).append("\n");
    sb.append("  low: ").append(low).append("\n");
    sb.append("  close: ").append(close).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}