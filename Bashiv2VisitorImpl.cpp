#include "Bashiv2VisitorImpl.h"

/**/
antlrcpp::Any BashiV2VisitorImpl::visitScript(Bashiv2Parser::ScriptContext *ctx) {
    // Implementa la visita para la regla script
    for (auto statementContext : ctx->statement()) {
        visit(statementContext);
    }
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitCommand(Bashiv2Parser::CommandContext *ctx) {
    // Implementa la visita para la regla command
    if (ctx->simpleCommand()) {
        return visit(ctx->simpleCommand());
    } else if (ctx->ifCommand()) {
        return visit(ctx->ifCommand());
    }
    // Añade lógica para otras reglas de command si es necesario
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitSimpleCommand(Bashiv2Parser::SimpleCommandContext *ctx) {
    // Añadir lógica para imprimir los argumentos directamente
    for (auto arg : ctx->ARG()) {
        // Imprimir los argumentos como texto directamente
        std::cout << arg->getText() << " ";
    }

    // Imprimir una nueva línea al final
    std::cout << std::endl;

    // Retornar un valor (puedes ajustar esto según tus necesidades)
    return 0; // Por ejemplo, 0 para indicar éxito
}
antlrcpp::Any BashiV2VisitorImpl::visitLoop(Bashiv2Parser::LoopContext *ctx) {
    std::string loopType = ctx->WORD(0)->getText();

    if (loopType == "for") {
        // Es un bucle 'for'
        std::string loopVariable = ctx->WORD(1)->getText();

        // Puedes hacer algo con la variable del bucle 'for' si es necesario

        // Resto de la lógica para el bucle 'for'
        if (ctx->WORD(2)->getText() == "in") {
            // Iterar sobre las palabras después de 'in'
            for (size_t i = 3; i < ctx->WORD().size(); ++i) {
                std::string loopIterationValue = ctx->WORD(i)->getText();

                // Puedes hacer algo con el valor de la iteración si es necesario
            }
        }

        // Visitar el cuerpo del bucle 'for'
        visit(ctx->script());
    } else if (loopType == "while") {
        // Es un bucle 'while'

        // Puedes hacer algo con la condición del bucle 'while' si es necesario
        visit(ctx->condition());

        // Visitar el cuerpo del bucle 'while'
        visit(ctx->script());
    }

    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitIfCommand(Bashiv2Parser::IfCommandContext *ctx) {
    // Visitar la condición del comando 'if'
    visit(ctx->condition());

    // Visitar el bloque 'then'
    visit(ctx->script(0));

    // Verificar si hay un bloque 'else'
    if (ctx->script(1)) {
        // Si hay un bloque 'else', visitarlo
        visit(ctx->script(1));
    }

    return nullptr;
}
antlrcpp::Any BashiV2VisitorImpl::visitAssignment(Bashiv2Parser::AssignmentContext *ctx) {
    std::string variableName = ctx->WORD()->getText();

    // Puedes hacer algo con el nombre de la variable si es necesario

    // Visitar la expresión a la derecha de la asignación
    visit(ctx->expression());

    // Realizar las acciones necesarias para la generación de código LLVM o cualquier otra lógica

    return nullptr;
}
