<a name="top"></a>
# Proyecto cuestionario - LADEI

- [cuestionario](#cuestionario)
	- [Crear cuestionario](#crear-cuestionario)
	


# <a name='cuestionario'></a> cuestionario

## <a name='crear-cuestionario'></a> Crear cuestionario
[Back to top](#top)

<p>Crea un cuestionario con los datos de las preguntas y respuestas.</p>

	POST /v1/cuestionario/

### Body

```
{
    "nombreCuestionario": "{nombre del cuestionario}",
    "fechaInicio": "{descripción del articulo}",
    "image": "{id de imagen}",
    "price": {precio actual},
    "stock": {stock actual}
}
```

### Success Response

Success-Response:

```
HTTP/1.1 200 Ok
{
    "currencyNumericCode": <value>,
    "currencyDescription": <value>,
    "currencyAbbreviation": <value>,
    "currencySymbol": <value>
}
```


### Error Response

400 Bad Request

```
HTTP/1.1 400 Bad Request
{
   "messages" : [
     {
       "path" : "{Nombre de la propiedad}",
       "message" : "{Motivo del error}"
     },
     ...
  ]
}
```
500 Server Error

```
HTTP/1.1 500 Internal Server Error
{
   "error" : "Not Found"
}
```
# <a name='currency_exchange'></a> Currency_Exchange

## <a name='amount-conversion'></a> Amount Conversion
[Back to top](#top)

<p>Crea una cuestionario con los datos de las preguntas y respuestas.</p>

	GET /v1/exchanger/


Body

```
{
    "name": "{nombre del articulo}",
    "description": "{descripción del articulo}",
    "image": "{id de imagen}",
    "price": {precio actual},
    "stock": {stock actual}
}
```

### Success Response

Success-Response:

```
HTTP/1.1 200 Ok
{
 "currencyNumericCode": <value>,
 "currencyDescription": <value>,
 "currencyAbbreviation": <value>,
 "currencySymbol": <value>,
 "amountConverted": <value>
}
```


### Error Response

400 Bad Request

```
HTTP/1.1 400 Bad Request
{
   "messages" : [
     {
       "path" : "{Nombre de la propiedad}",
       "message" : "{Motivo del error}"
     },
     ...
  ]
}
```
500 Server Error

```
HTTP/1.1 500 Internal Server Error
{
   "error" : "Not Found"
}
```
## <a name='convert-article-price'></a> Convert Article Price
[Back to top](#top)

<p>Gets the article's price and converts it to the specified currency.</p>

	GET /v1/exchanger/articles/:articleId/





### Parameter Parameters

| Name     | Type       | Description                           |
|:---------|:-----------|:--------------------------------------|
|  currency[] | String | <p>Currency list separated with ,</p>|


### Success Response

Success-Response:

```
HTTP/1.1 200 Ok
{
    "articleId": <value>,
    "conversions": {
        {
            "currencyId": <value>,
            "currencyNumericCode": <value>,
            "currencyDescription": <value>,
            "currencyAbbreviation": <value>,
            "currencySymbol": <value>,
            "amountConverted": <value>
        },
        {...}
      }
 }
```


### Error Response

400 Bad Request

```
HTTP/1.1 400 Bad Request
{
   "messages" : [
     {
       "path" : "{Nombre de la propiedad}",
       "message" : "{Motivo del error}"
     },
     ...
  ]
}
```
500 Server Error

```
HTTP/1.1 500 Internal Server Error
{
   "error" : "Not Found"
}
```
## <a name='convert-order-price-amount'></a> Convert Order Price Amount
[Back to top](#top)

<p>Gets the total amount of an order and converts it to the specified currency.</p>

	GET /v1/exchanger/orders/:orderId





### Parameter Parameters

| Name     | Type       | Description                           |
|:---------|:-----------|:--------------------------------------|
|  currency[] | String | <p>Currency list separated with ,</p>|


### Success Response

Success-Response:

```
HTTP/1.1 200 Ok
{
    "orderId": <value>,
    "conversions": {
        {
            "currencyNumericCode": <value>,
            "currencyDescription": <value>,
            "currencyAbbreviation": <value>,
            "currencySymbol": <value>,
            "amountConverted": <value>
        },
        {...}
    }
 }
```


### Error Response

400 Bad Request

```
HTTP/1.1 400 Bad Request
{
   "messages" : [
     {
       "path" : "{Nombre de la propiedad}",
       "message" : "{Motivo del error}"
     },
     ...
  ]
}
```
500 Server Error

```
HTTP/1.1 500 Internal Server Error
{
   "error" : "Not Found"
}
```
# <a name='quotation'></a> Quotation

## <a name='get-quote'></a> Get Quote
[Back to top](#top)

<p>Gets the direct conversion of a currency</p>

	GET /v1/exchanger/currency/price





### Parameter Parameters

| Name     | Type       | Description                           |
|:---------|:-----------|:--------------------------------------|
|  originCurrency | String | <p>The origin currency</p>|
|  destinationCurrency | String | <p>The destination currency</p>|


### Success Response

Success-Response:

```
HTTP/1.1 200 Ok
{
   "originCurrency" {
       "currencyNumericCode": <value>,
       "currencyDescription": <value>,
       "currencyAbbreviation": <value>,
       "currencySymbol": <value>,
       "amount": <value>
   },
   "destinationCurrency" {
       "currencyNumericCode": <value>,
       "currencyDescription": <value>,
       "currencyAbbreviation": <value>,
       "currencySymbol": <value>,
       "amount": <value>
   }
}
```


### Error Response

400 Bad Request

```
HTTP/1.1 400 Bad Request
{
   "messages" : [
     {
       "path" : "{Nombre de la propiedad}",
       "message" : "{Motivo del error}"
     },
     ...
  ]
}
```
500 Server Error

```
HTTP/1.1 500 Internal Server Error
{
   "error" : "Not Found"
}
```
# <a name='rabbitmq_get'></a> RabbitMQ_GET

## <a name='get-order-in-currency'></a> Get Order in Currency
[Back to top](#top)

<p>Ask for the total amount of an Order in a currency</p>

	DIRECT currency-order





### Parameter Parameters

| Name     | Type       | Description                           |
|:---------|:-----------|:--------------------------------------|
|  currencyId | Numeric | <p>The id of a currency</p>|
|  orderId | Numeric | <p>The id of an order</p>|




