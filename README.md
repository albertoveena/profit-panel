# Profit Panel

Panel para saber cuánto gana de verdad una tienda online cada día.

Junta los pedidos de la tienda, el coste de cada producto y lo que se gasta en anuncios, y calcula el beneficio diario y por producto. Funciona con cualquier tienda: los datos entran por CSV o por conectores (Shopify, WooCommerce...).

## Tecnologías

- Java 21 + Spring Boot
- MySQL (en Docker)
- React (próximamente)

## Cómo arrancarlo

1. Levantar la base de datos:

```
docker compose up -d
```

2. Arrancar el backend:

```
mvn spring-boot:run
```

La API queda en `http://localhost:8080`.

## Roadmap

- [x] Proyecto base con Spring Boot y MySQL
- [ ] Productos con su coste
- [ ] Importar pedidos desde CSV
- [ ] Importar gasto en anuncios (Meta, Google, TikTok...)
- [ ] Cálculo de beneficio diario y por producto
- [ ] Dashboard en React
- [ ] Conectores con Shopify y WooCommerce
- [ ] Resumen diario por Telegram
- [ ] Despliegue
