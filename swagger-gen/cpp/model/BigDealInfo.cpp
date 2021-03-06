/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.8.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */



#include "BigDealInfo.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

BigDealInfo::BigDealInfo()
{
    m_Side = utility::conversions::to_string_t("");
    m_SideIsSet = false;
    m_Timestamp = 0;
    m_TimestampIsSet = false;
    m_Symbol = utility::conversions::to_string_t("");
    m_SymbolIsSet = false;
    m_Value = 0;
    m_ValueIsSet = false;
}

BigDealInfo::~BigDealInfo()
{
}

void BigDealInfo::validate()
{
    // TODO: implement validation
}

web::json::value BigDealInfo::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_SideIsSet)
    {
        val[utility::conversions::to_string_t("side")] = ModelBase::toJson(m_Side);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t("timestamp")] = ModelBase::toJson(m_Timestamp);
    }
    if(m_SymbolIsSet)
    {
        val[utility::conversions::to_string_t("symbol")] = ModelBase::toJson(m_Symbol);
    }
    if(m_ValueIsSet)
    {
        val[utility::conversions::to_string_t("value")] = ModelBase::toJson(m_Value);
    }

    return val;
}

void BigDealInfo::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("side")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("side")];
        if(!fieldValue.is_null())
        {
            setSide(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("timestamp")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("timestamp")];
        if(!fieldValue.is_null())
        {
            setTimestamp(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("symbol")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("symbol")];
        if(!fieldValue.is_null())
        {
            setSymbol(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("value")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("value")];
        if(!fieldValue.is_null())
        {
            setValue(ModelBase::int32_tFromJson(fieldValue));
        }
    }
}

void BigDealInfo::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_SideIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("side"), m_Side));
        
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("timestamp"), m_Timestamp));
    }
    if(m_SymbolIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("symbol"), m_Symbol));
        
    }
    if(m_ValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("value"), m_Value));
    }
}

void BigDealInfo::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("side")))
    {
        setSide(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("side"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("timestamp")))
    {
        setTimestamp(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("timestamp"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("symbol")))
    {
        setSymbol(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("symbol"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("value")))
    {
        setValue(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("value"))));
    }
}

utility::string_t BigDealInfo::getSide() const
{
    return m_Side;
}


void BigDealInfo::setSide(utility::string_t value)
{
    m_Side = value;
    m_SideIsSet = true;
}
bool BigDealInfo::sideIsSet() const
{
    return m_SideIsSet;
}

void BigDealInfo::unsetSide()
{
    m_SideIsSet = false;
}

int32_t BigDealInfo::getTimestamp() const
{
    return m_Timestamp;
}


void BigDealInfo::setTimestamp(int32_t value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}
bool BigDealInfo::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void BigDealInfo::unsetTimestamp()
{
    m_TimestampIsSet = false;
}

utility::string_t BigDealInfo::getSymbol() const
{
    return m_Symbol;
}


void BigDealInfo::setSymbol(utility::string_t value)
{
    m_Symbol = value;
    m_SymbolIsSet = true;
}
bool BigDealInfo::symbolIsSet() const
{
    return m_SymbolIsSet;
}

void BigDealInfo::unsetSymbol()
{
    m_SymbolIsSet = false;
}

int32_t BigDealInfo::getValue() const
{
    return m_Value;
}


void BigDealInfo::setValue(int32_t value)
{
    m_Value = value;
    m_ValueIsSet = true;
}
bool BigDealInfo::valueIsSet() const
{
    return m_ValueIsSet;
}

void BigDealInfo::unsetValue()
{
    m_ValueIsSet = false;
}

}
}
}
}

