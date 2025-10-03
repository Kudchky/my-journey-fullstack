# Day 1 - Generating Random Numbers Within a Specific Range

## 🎯 Objetivo
Aprender a generar números aleatorios en Java dentro de un rango específico.

## 📖 Enunciado Detallado
Crear un programa que genere números aleatorios entre un valor mínimo y máximo
(inclusivos). El programa debe:
- Permitir configurar límites inferior y superior
- Generar múltiples números aleatorios
- Validar que el rango sea correcto

## 🧠 Temas a Estudiar Antes
- Clase `java.util.Random`
- Clase `java.util.concurrent.ThreadLocalRandom` (Java 7+)
- Método `nextInt(int bound)`
- Fórmula para rangos: `min + random.nextInt(max - min + 1)`

## 💡 Consejos y Tips
1. **ThreadLocalRandom** es más eficiente en entornos multi-hilo
2. Siempre verifica que `min <= max`
3. Usa `bound + 1` para incluir el límite superior
4. Considera usar `Math.random()` para números decimales

## 🚀 Retos Adicionales
- [ ] Generar números con distribución normal
- [ ] Crear un generador de contraseñas aleatorias
- [ ] Implementar tests para verificar la distribución

## 📚 Recursos Recomendados
- [Java Random Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
- [Effective Java - Item 47](https://learning.oreilly.com/library/view/effective-java-3rd/9780134686097/)