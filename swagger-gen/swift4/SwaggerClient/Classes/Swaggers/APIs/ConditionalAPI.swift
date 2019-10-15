//
// ConditionalAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class ConditionalAPI {
    /**
     Cancel conditional order.
     
     - parameter stopOrderId: (query) Order ID of conditional order. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func conditionalCancel(stopOrderId: String, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        conditionalCancelWithRequestBuilder(stopOrderId: stopOrderId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Cancel conditional order.
     - POST /open-api/stop-order/cancel
     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apiKey
     - API Key:
       - type: apiKey sign (QUERY)
       - name: apiSignature
     - API Key:
       - type: apiKey timestamp (QUERY)
       - name: timestamp
     - examples: [{contentType=application/json, example=""}]
     
     - parameter stopOrderId: (query) Order ID of conditional order. 

     - returns: RequestBuilder<Any> 
     */
    open class func conditionalCancelWithRequestBuilder(stopOrderId: String) -> RequestBuilder<Any> {
        let path = "/open-api/stop-order/cancel"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "stop_order_id": stopOrderId
        ])

        let requestBuilder: RequestBuilder<Any>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get my conditional order list.
     
     - parameter stopOrderId: (query) Order ID of conditional order. (optional)
     - parameter orderLinkId: (query) Agency customized order ID. (optional)
     - parameter symbol: (query) Contract type. Default BTCUSD. (optional)
     - parameter order: (query) Sort orders by creation date (optional)
     - parameter page: (query) Page. Default getting first page data (optional)
     - parameter limit: (query) Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func conditionalGetOrders(stopOrderId: String? = nil, orderLinkId: String? = nil, symbol: String? = nil, order: String? = nil, page: Double? = nil, limit: Double? = nil, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        conditionalGetOrdersWithRequestBuilder(stopOrderId: stopOrderId, orderLinkId: orderLinkId, symbol: symbol, order: order, page: page, limit: limit).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get my conditional order list.
     - GET /open-api/stop-order/list
     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apiKey
     - API Key:
       - type: apiKey sign (QUERY)
       - name: apiSignature
     - API Key:
       - type: apiKey timestamp (QUERY)
       - name: timestamp
     - examples: [{contentType=application/json, example=""}]
     
     - parameter stopOrderId: (query) Order ID of conditional order. (optional)
     - parameter orderLinkId: (query) Agency customized order ID. (optional)
     - parameter symbol: (query) Contract type. Default BTCUSD. (optional)
     - parameter order: (query) Sort orders by creation date (optional)
     - parameter page: (query) Page. Default getting first page data (optional)
     - parameter limit: (query) Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page. (optional)

     - returns: RequestBuilder<Any> 
     */
    open class func conditionalGetOrdersWithRequestBuilder(stopOrderId: String? = nil, orderLinkId: String? = nil, symbol: String? = nil, order: String? = nil, page: Double? = nil, limit: Double? = nil) -> RequestBuilder<Any> {
        let path = "/open-api/stop-order/list"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "stop_order_id": stopOrderId, 
            "order_link_id": orderLinkId, 
            "symbol": symbol, 
            "order": order, 
            "page": page, 
            "limit": limit
        ])

        let requestBuilder: RequestBuilder<Any>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Place a new conditional order.
     
     - parameter side: (query) Side. 
     - parameter symbol: (query) Contract type. 
     - parameter orderType: (query) Conditional order type. 
     - parameter qty: (query) Order quantity. 
     - parameter price: (query) Execution price for conditional order 
     - parameter basePrice: (query) Send current market price. It will be used to compare with the value of &#39;stop_px&#39;, to decide whether your conditional order will be triggered by crossing trigger price from upper side or lower side. Mainly used to identify the expected direction of the current conditional order.. 
     - parameter stopPx: (query) Trigger price. 
     - parameter timeInForce: (query) Time in force. 
     - parameter closeOnTrigger: (query) close on trigger. (optional)
     - parameter orderLinkId: (query) Customized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique.. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func conditionalNew(side: String, symbol: String, orderType: String, qty: Double, price: Double, basePrice: Double, stopPx: Double, timeInForce: String, closeOnTrigger: Bool? = nil, orderLinkId: String? = nil, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        conditionalNewWithRequestBuilder(side: side, symbol: symbol, orderType: orderType, qty: qty, price: price, basePrice: basePrice, stopPx: stopPx, timeInForce: timeInForce, closeOnTrigger: closeOnTrigger, orderLinkId: orderLinkId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Place a new conditional order.
     - POST /open-api/stop-order/create
     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apiKey
     - API Key:
       - type: apiKey sign (QUERY)
       - name: apiSignature
     - API Key:
       - type: apiKey timestamp (QUERY)
       - name: timestamp
     - examples: [{contentType=application/json, example=""}]
     
     - parameter side: (query) Side. 
     - parameter symbol: (query) Contract type. 
     - parameter orderType: (query) Conditional order type. 
     - parameter qty: (query) Order quantity. 
     - parameter price: (query) Execution price for conditional order 
     - parameter basePrice: (query) Send current market price. It will be used to compare with the value of &#39;stop_px&#39;, to decide whether your conditional order will be triggered by crossing trigger price from upper side or lower side. Mainly used to identify the expected direction of the current conditional order.. 
     - parameter stopPx: (query) Trigger price. 
     - parameter timeInForce: (query) Time in force. 
     - parameter closeOnTrigger: (query) close on trigger. (optional)
     - parameter orderLinkId: (query) Customized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique.. (optional)

     - returns: RequestBuilder<Any> 
     */
    open class func conditionalNewWithRequestBuilder(side: String, symbol: String, orderType: String, qty: Double, price: Double, basePrice: Double, stopPx: Double, timeInForce: String, closeOnTrigger: Bool? = nil, orderLinkId: String? = nil) -> RequestBuilder<Any> {
        let path = "/open-api/stop-order/create"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "side": side, 
            "symbol": symbol, 
            "order_type": orderType, 
            "qty": qty, 
            "price": price, 
            "base_price": basePrice, 
            "stop_px": stopPx, 
            "time_in_force": timeInForce, 
            "close_on_trigger": closeOnTrigger, 
            "order_link_id": orderLinkId
        ])

        let requestBuilder: RequestBuilder<Any>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Replace conditional order. Only incomplete orders can be modified. 
     
     - parameter orderId: (query) Order ID. 
     - parameter symbol: (query) Contract type. 
     - parameter pRQty: (query) Order quantity. (optional)
     - parameter pRPrice: (query) Order price. (optional)
     - parameter pRTriggerPrice: (query) Trigger price. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func conditionalReplace(orderId: String, symbol: String, pRQty: Double? = nil, pRPrice: Double? = nil, pRTriggerPrice: Double? = nil, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        conditionalReplaceWithRequestBuilder(orderId: orderId, symbol: symbol, pRQty: pRQty, pRPrice: pRPrice, pRTriggerPrice: pRTriggerPrice).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Replace conditional order. Only incomplete orders can be modified. 
     - POST /open-api/stop-order/replace
     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apiKey
     - API Key:
       - type: apiKey sign (QUERY)
       - name: apiSignature
     - API Key:
       - type: apiKey timestamp (QUERY)
       - name: timestamp
     - examples: [{contentType=application/json, example=""}]
     
     - parameter orderId: (query) Order ID. 
     - parameter symbol: (query) Contract type. 
     - parameter pRQty: (query) Order quantity. (optional)
     - parameter pRPrice: (query) Order price. (optional)
     - parameter pRTriggerPrice: (query) Trigger price. (optional)

     - returns: RequestBuilder<Any> 
     */
    open class func conditionalReplaceWithRequestBuilder(orderId: String, symbol: String, pRQty: Double? = nil, pRPrice: Double? = nil, pRTriggerPrice: Double? = nil) -> RequestBuilder<Any> {
        let path = "/open-api/stop-order/replace"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "order_id": orderId, 
            "symbol": symbol, 
            "p_r_qty": pRQty, 
            "p_r_price": pRPrice, 
            "p_r_trigger_price": pRTriggerPrice
        ])

        let requestBuilder: RequestBuilder<Any>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
