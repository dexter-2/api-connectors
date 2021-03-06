//
// LinearTradeRecordItem.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LinearTradeRecordItem: Codable {

    public var closedSize: Double?
    public var execFee: Double?
    public var execId: String?
    public var execPrice: Double?
    public var execQty: Double?
    public var execType: String?
    public var execValue: Double?
    public var feeRate: Double?
    public var lastLiquidityInd: String?
    public var leavesQty: Double?
    public var orderId: String?
    public var orderLinkId: String?
    public var orderPrice: Double?
    public var orderQty: Double?
    public var orderType: String?
    public var price: Double?
    public var side: String?
    public var symbol: String?
    public var tradeTime: Int64?
    public var tradeTimeMs: Int64?

    public init(closedSize: Double?, execFee: Double?, execId: String?, execPrice: Double?, execQty: Double?, execType: String?, execValue: Double?, feeRate: Double?, lastLiquidityInd: String?, leavesQty: Double?, orderId: String?, orderLinkId: String?, orderPrice: Double?, orderQty: Double?, orderType: String?, price: Double?, side: String?, symbol: String?, tradeTime: Int64?, tradeTimeMs: Int64?) {
        self.closedSize = closedSize
        self.execFee = execFee
        self.execId = execId
        self.execPrice = execPrice
        self.execQty = execQty
        self.execType = execType
        self.execValue = execValue
        self.feeRate = feeRate
        self.lastLiquidityInd = lastLiquidityInd
        self.leavesQty = leavesQty
        self.orderId = orderId
        self.orderLinkId = orderLinkId
        self.orderPrice = orderPrice
        self.orderQty = orderQty
        self.orderType = orderType
        self.price = price
        self.side = side
        self.symbol = symbol
        self.tradeTime = tradeTime
        self.tradeTimeMs = tradeTimeMs
    }

    public enum CodingKeys: String, CodingKey { 
        case closedSize = "closed_size"
        case execFee = "exec_fee"
        case execId = "exec_id"
        case execPrice = "exec_price"
        case execQty = "exec_qty"
        case execType = "exec_type"
        case execValue = "exec_value"
        case feeRate = "fee_rate"
        case lastLiquidityInd = "last_liquidity_ind"
        case leavesQty = "leaves_qty"
        case orderId = "order_id"
        case orderLinkId = "order_link_id"
        case orderPrice = "order_price"
        case orderQty = "order_qty"
        case orderType = "order_type"
        case price
        case side
        case symbol
        case tradeTime = "trade_time"
        case tradeTimeMs = "trade_time_ms"
    }


}

