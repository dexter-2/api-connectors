=begin
#Bybit API

### REST API for the Bybit Exchange. 

OpenAPI spec version: 1.0.0
Contact: support@bybit.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8

=end

require 'uri'

module SwaggerClient
  class FundingApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Funding settlement occurs every 8 hours at 00:00 UTC, 08:00 UTC and 16:00 UTC. The current interval's fund fee settlement is based on the previous interval's fund rate. For example, at 16:00, the settlement is based on the fund rate generated at 8:00. The fund rate generated at 16:00 will be used at 0:00 on the next day.
    # @param symbol Contract type.
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def funding_get_rate(symbol, opts = {})
      data, _status_code, _headers = funding_get_rate_with_http_info(symbol, opts)
      data
    end

    # Funding settlement occurs every 8 hours at 00:00 UTC, 08:00 UTC and 16:00 UTC. The current interval&#39;s fund fee settlement is based on the previous interval&#39;s fund rate. For example, at 16:00, the settlement is based on the fund rate generated at 8:00. The fund rate generated at 16:00 will be used at 0:00 on the next day.
    # @param symbol Contract type.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def funding_get_rate_with_http_info(symbol, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FundingApi.funding_get_rate ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling FundingApi.funding_get_rate"
      end
      # resource path
      local_var_path = '/open-api/funding/prev-funding'

      # query parameters
      query_params = {}
      query_params[:'symbol'] = symbol

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apiKey', 'apiSignature', 'timestamp']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FundingApi#funding_get_rate\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get predicted funding rate and funding fee.
    # @param symbol Contract type.
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def funding_predicted(symbol, opts = {})
      data, _status_code, _headers = funding_predicted_with_http_info(symbol, opts)
      data
    end

    # Get predicted funding rate and funding fee.
    # @param symbol Contract type.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def funding_predicted_with_http_info(symbol, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FundingApi.funding_predicted ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling FundingApi.funding_predicted"
      end
      # resource path
      local_var_path = '/open-api/funding/predicted-funding'

      # query parameters
      query_params = {}
      query_params[:'symbol'] = symbol

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apiKey', 'apiSignature', 'timestamp']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FundingApi#funding_predicted\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get predicted funding rate and funding fee.
    # @param symbol Contract type.
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def funding_predicted_rate(symbol, opts = {})
      data, _status_code, _headers = funding_predicted_rate_with_http_info(symbol, opts)
      data
    end

    # Get predicted funding rate and funding fee.
    # @param symbol Contract type.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def funding_predicted_rate_with_http_info(symbol, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FundingApi.funding_predicted_rate ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling FundingApi.funding_predicted_rate"
      end
      # resource path
      local_var_path = '/open-api/funding/prev-funding-rate'

      # query parameters
      query_params = {}
      query_params[:'symbol'] = symbol

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apiKey', 'apiSignature', 'timestamp']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FundingApi#funding_predicted_rate\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
