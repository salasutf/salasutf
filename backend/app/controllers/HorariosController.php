<?php

defined('INITIALIZED') OR exit('You cannot access this file directly');

class HorariosController extends Controller {

    public function index($param) {
        switch (strtolower($this->getRequest())) {
            case 'get':
                $this->get(@$param['id']);
                break;
            case 'post':
                $this->post();
                break;
            case 'put':
                $this->put(@$param['id']);
                break;
            case 'delete':
                $this->delete(@$param['id']);
                break;
        }
    }

    public function post() {
        
        $recurso = new Horario();
        $recurso->setAtivo(true);
        $recurso->setDescricao($_POST['descricao']);
        $recurso->setHorarioFim($_POST['horarioFim']);
        $recurso->setHorarioInicio($_POST['horarioInicio']);
        $recurso->setTurno($_POST['turno']);
        $rec = $recurso->save();

        if ( is_null($rec) || $rec == false ) {
            $retorno['return'] = [
                "type" => "error",
                "message" => "Não foi possível registrar o usuário."
            ];
        } else {
            //TODO: gravar Log
            $retorno['return'] = [
                "type" => "success",
                "message" => "Horário registrado com sucesso",
                "object" => $rec
            ];
        }

        echo json_encode($retorno);
    }

    public function get($id) {
        if (is_null($id) or $id == '') {
            //Listar uma coleção
            $rec = new Horario();
            echo jsonSerialize($rec->all());
        } else {
            //Exibir detalhes de uma reserva
            $rec = new Horario();
            echo jsonSerialize($rec->where('id = ?', $id)->find());
        }
    }

    public function put($id = null) {
        echo json_encode(["return" => "Aqui atualiza o registro de id " . $id]);
    }

    public function delete($id = null) {
        echo json_encode(["return" => "Aqui exclui o registro de id " . $id]);
    }

}
